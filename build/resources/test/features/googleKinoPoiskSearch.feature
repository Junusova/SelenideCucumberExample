Feature: Google KinoPoisk search

  Scenario: user may search KinoPoisk web site for finding all films

#    Given Open browser with google.com
#    When A keyword "kinopoisk" was entered in input field
#    Then At least top 1 matches should be shown
#    Then The first one should be consist www.kinopoisk.ru


  Scenario: user may search KinoPoisk web site for finding all films in Russian, too

    Given Open browser with google
    When A keyword "кинопоиск" was entered in input field
    Then At least top 1 matches should be shown
    Then The first one should be consist www.kinopoisk.ru

