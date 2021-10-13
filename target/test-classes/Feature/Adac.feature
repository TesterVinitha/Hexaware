Feature: Verifying Adactin hotel functions

  Scenario Outline: Verifying Booking confirmation function
    Given User is on Login Page
    When User should enters "<userName>" and "<Password>"and Click Login button
    And User should enters the "<Location>" and "<hotelName>" and "<roomType>" and "<NumOfRoom>" and "<checkInDate>" and "<checkOutDate>" then "<adult>" and "<child>" and enters Search button
    When user should select the Hotel
    When User should provides the personal informations "<firstName>" and "<lastName>" and "<address>" and "<creditCardNumber>" and "<cardType>" then "<expMonth>" and "<expYear>" and "<cvv>"
    Then User should validate the order id

    Examples: 
      | userName    | Password    | Location | hotelName      | roomType | NumOfRoom | checkInDate | checkOutDate | adult   | child   | firstName | lastName  | address      | creditCardNumber | cardType | expMonth | expYear | cvv |
      | userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
      #| userUnknown | Password@12 | London   | Hotel Sunshine | Double   | 1 - One   | 13/10/2021  | 14/10/2021   | 2 - Two | 2 - Two | Jagan     | Vasudevan | Times Square | 1234567812345678 | VISA     | March    |    2022 | 098 |
