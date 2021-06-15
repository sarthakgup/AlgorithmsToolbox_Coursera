# python3

# taking a look at python version too
# i need to improve my python skills

# def indicates new user defined function aka method
def sum_of_two_digits(first_digit, second_digit):
    return first_digit + second_digit

# main method header
if __name__ == '__main__':
    a, b = map(int, input().split())
    print(sum_of_two_digits(a, b))
