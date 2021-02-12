#include <iostream>
#include <cstdlib>
#include <ctime>
#include "lib/greeting_service.hpp"
#include "lib/time_of_day_system.hpp"

class ConcreteTimeOfDaySystem : virtual public TimeOfDaySystem
{
public:
    bool isMorning() override {
        return rand() % 100 < 50;
    }
};

int main() {
    srand(time(nullptr));
    std::shared_ptr<TimeOfDaySystem> timeOfDaySystem = std::make_shared<ConcreteTimeOfDaySystem>();
    std::shared_ptr<GreetingService> greetingService = std::make_shared<GreetingService>(timeOfDaySystem);
    std::cout << greetingService->sayHello() << std::endl;
    std::cout << greetingService->sayHello() << std::endl;
    std::cout << greetingService->sayHello() << std::endl;
    std::cout << greetingService->sayHello() << std::endl;
    return 0;
}
