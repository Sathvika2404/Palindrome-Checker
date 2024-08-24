# Palindrome-Checker
A Java application that determines whether a given input string is a palindrome. The program intelligently handles various complexities such as spaces, punctuation, special characters, and case sensitivity to provide accurate results.

**Features**

**Case Insensitive:** Treats uppercase and lowercase letters as equal.

**Alphanumeric Filtering:** Ignores all non-alphanumeric characters, including spaces and punctuation.

**Edge Case Handling:** Appropriately handles empty strings and single-character inputs.

**User-Friendly Messages:** Provides clear and concise output messages indicating the result.


**How It Works**

**Input Acquisition:**


The program prompts the user to enter a string.

**Input Processing:**

**Filtering:** Removes all non-alphanumeric characters using regular expressions.

**Normalization:** Converts the string to lowercase to ensure case insensitivity.

**Palindrome Verification:**

**Comparison:** Compares characters from the start and end of the string moving towards the center.

**Decision Making:** Determines whether the processed string is a palindrome based on the comparison.

**Output:**

Displays "Palindrome" if the input string is a palindrome.

Displays "Not A Palindrome" if the input string is not a palindrome.

Handles special cases with appropriate messages.

Usage

**Prerequisites**

Java Development Kit (JDK): Ensure that JDK is installed on your machine.

