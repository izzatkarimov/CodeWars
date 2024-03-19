'''
Question:
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
high_and_low("1 2 3 4 5")  # return "5 1"
high_and_low("1 2 -3 4 5") # return "5 -3"
high_and_low("1 9 3 4 -5") # return "9 -5"
'''


#Solution:

def high_and_low(numbers):
    numbers = [int(num) for num in numbers.split()]
    max_num = max(numbers)
    min_num = min(numbers)
    return f"{max_num} {min_num}"