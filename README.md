# Number-Palindrome
Program that checks if a number is a palindrome or not.

Logic to check a palindrome number:
                                  1.Find the reverse of the given number
                                  2.Store the it in a variable
                                  3.Compare number with its reverse
                                  
Logic to reverse a number:
                         1.Extract the last digit of the given number by performing the modulo division
                         2.Store the last digit to some variable i.e. lastDigit = num % 10
                         3.Increase the place value by 1
                         4.To increase the place value multiply the reverse variable by 10 i.e. reverse *= 10
                         5.Add lastDigit to reverse
                         6.Since the last digit of the number is processed, remove the last digit of num by 
                         dividing the number by 10.
                         7.Repeat steps until number is not equal to or greater than zero
