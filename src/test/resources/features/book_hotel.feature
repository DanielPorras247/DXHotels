#Author: dporras247@gmail.com

Feature: As a user want to book a hotel on the website of dx hotels

  Background:
    Given that the user navigate to the dx hotels website

  @ReserveRoom
  Scenario Outline: book a hotel room
    When search a hotel
      | <id> | <check_in> | <check_out> |
    And book a hotel room
    Then verify that the room was selected
      | <titleToVerify> |

    Examples:
      | destination   | id  | check_in     | check_out    | titleToVerify    |
      | Los Angeles   | 1   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | San Francisco | 2   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | Las Vegas     | 3   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | Honolulu      | 4   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | New York      | 5   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | Nassau        | 6   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | Paris         | 7   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | London        | 8   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |
      | Rome          | 9   | 2021/03/26   | 2021/03/27   | TOTAL TO PAY NOW |