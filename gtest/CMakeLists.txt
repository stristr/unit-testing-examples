cmake_minimum_required(VERSION 3.17)
project(gtest_gmock_example)

set(CMAKE_CXX_STANDARD 14)

add_subdirectory(vendor/googletest)
include_directories(vendor/googletest/googletest/include ../vendor/googletest/googlemock/include)
add_executable(demo main.cpp)
add_executable(greeting_service_test greeting_service_test.cpp)
target_link_libraries(greeting_service_test gmock gtest)
