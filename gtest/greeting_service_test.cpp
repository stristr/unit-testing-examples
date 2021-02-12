#include "gmock/gmock.h"
#include "gtest/gtest.h"
#include "lib/time_of_day_system.hpp"
#include "lib/greeting_service.hpp"

using ::testing::Return;

class MockTimeOfDaySystem : public TimeOfDaySystem
{
public:
    MOCK_METHOD0(isMorning, bool());
};

TEST(GreetingServiceTest, SayHelloInTheMorning)
{
    std::shared_ptr<MockTimeOfDaySystem> timeOfDaySystem = std::make_shared<MockTimeOfDaySystem>();
    GreetingService greetingService(timeOfDaySystem);

    EXPECT_CALL(*timeOfDaySystem, isMorning())
        .Times(1)
        .WillOnce(Return(true));
    ASSERT_EQ(greetingService.sayHello().compare("Good morning"), 0);
}

TEST(GreetingServiceTest, SayHelloAtNight)
{
    std::shared_ptr<MockTimeOfDaySystem> timeOfDaySystem = std::make_shared<MockTimeOfDaySystem>();
    GreetingService greetingService(timeOfDaySystem);

    EXPECT_CALL(*timeOfDaySystem, isMorning())
            .Times(1)
            .WillOnce(Return(false));
    ASSERT_EQ(greetingService.sayHello().compare("Goodnight"), 0);
}

int main(int argc, char** argv) {
    ::testing::InitGoogleMock(&argc, argv);
    return RUN_ALL_TESTS();
}
