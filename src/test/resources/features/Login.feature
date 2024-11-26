Feature: Opening tekSchool Website


  Scenario: Searching and Opening tekSchool website through the google
  Given The user is on the browser searchbar or on google page
  When Enter the tekSchool's website address
  When Clicking on searchbutton
  Then User see the targeted page
  When Clicking on the targeted link
  Then User will be on the relavent page


    Feature: Login Functionality on gmail


      Scenario: Login successfully on gamil
      Given The user is on login page
        When The user enters the username and password
        And The user clicks on login button
        Then The user is on his gmail


        Feature: navigate an address on googleMaps


          Scenario: navigate and finding the exact address of a location through googleMaps
            Given The user is on googleMaps page
            When The user enters the considered address on search bar
            When The user clicks on search button
            Then The user see and find the exact address of expected location






