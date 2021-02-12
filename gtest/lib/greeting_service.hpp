#ifndef GREETER_SERVICE_H
#define GREETER_SERVICE_H

#include <memory>
#include <string>
#include "time_of_day_system.hpp"

class GreetingService
{
public:
    explicit GreetingService(std::shared_ptr<TimeOfDaySystem> timeOfDaySystem)
    {
        this->timeOfDaySystem = timeOfDaySystem;
    }

    std::string sayHello();

private:
    std::shared_ptr<TimeOfDaySystem> timeOfDaySystem;
};

std::string GreetingService::sayHello() {
    return this->timeOfDaySystem->isMorning() ? "Good morning" : "Goodnight";
}

#endif
