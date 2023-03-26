@HECWA10-41
Feature: File functionality

  Background:
    Given the user is on the file page

  Scenario:user can upload a file


    When User creates a new folder named "us move copy delete" if it does not exist
    Then User clicks on folder "us move copy delete"
    Then User clicks on "plus sign"
    Then Send the files to "upload file input"
      |/Users/mac/sample1.txt |
      |/Users/mac/sample2.txt |
      |/Users/mac/sample3.txt |
      |/Users/mac/sample4.txt |
      |/Users/mac/sample5.txt |
      |/Users/mac/sample6.txt |
      |/Users/mac/sample7.txt |

    Then Verify the files is in the folder
      | sample1.txt |
      | sample2.txt |
      | sample3.txt |
      | sample4.txt |
      | sample5.txt |
      | sample6.txt |
      | sample7.txt |



  Scenario:user can move any selected item
    When User clicks on folder "us move copy delete"
    When User creates a new folder named "move folder" if it does not exist
    When User selects the file named "sample1.txt"
    Then User clicks on "Actions"
    Then User clicks on "Move or copy"
    Then User clicks on "move folder"
    Then User clicks on "Move To"
    Then Verify the file named "sample1.txt" is not in the folder
    Then User clicks on folder "move folder"
    Then Verify the file named "sample1.txt" is in the folder

  Scenario:user can move any item by dragging
    When User clicks on folder "us move copy delete"
    Then User drags the file named "sample2.txt" to "move folder"
    Then Verify the file named "sample2.txt" is not in the folder
    Then User clicks on folder "move folder"
    Then Verify the file named "sample2.txt" is in the folder

  Scenario:user can move with right click
    When User clicks on folder "us move copy delete"
    When User right clicks on "sample3.txt"
    Then User clicks on "Move or copy Context"
    Then User clicks on "move folder"
    Then User clicks on "Move To"
    Then Verify the file named "sample3.txt" is not in the folder
    Then User clicks on folder "move folder"
    Then Verify the file named "sample3.txt" is in the folder


  Scenario:user can copy any selected item
    When User clicks on folder "us move copy delete"
    When User creates a new folder named "copy folder" if it does not exist
    When User selects the file named "sample4.txt"
    Then User clicks on "Actions"
    Then User clicks on "Move or copy"
    Then User clicks on "copy folder"
    Then User clicks on "Copy To"
    Then Verify the file named "sample4.txt" is in the folder
    When User clicks on folder "copy folder"
    Then Verify the file named "sample4.txt" is in the folder
#

  Scenario:user can copy any item with right click
    When User clicks on folder "us move copy delete"
    When User creates a new folder named "copy folder" if it does not exist
    When User right clicks on "sample5.txt"
    Then User clicks on "Move or copy Context"
    Then User clicks on "copy folder"
    Then User clicks on "Copy To"
    Then Verify the file named "sample5.txt" is in the folder
    Then User clicks on folder "copy folder"
    Then Verify the file named "sample5.txt" is in the folder

  Scenario:user can delete any selected item
    When User clicks on folder "us move copy delete"
    When User selects the file named "sample6.txt"
    Then User clicks on "Actions"
    Then User clicks on "delete"
    Then Verify the file named "sample6.txt" is not in the folder

  Scenario:user can delete any item with right click
    When User clicks on folder "us move copy delete"
    When User right clicks on "sample7.txt"
    Then User clicks on "deleteCon"
    Then Verify the file named "sample7.txt" is not in the folder


