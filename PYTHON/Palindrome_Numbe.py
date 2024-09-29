num = int ( input ( "Enter A Number : " ) )
temp = num
rev = 0

while num > 0 :
    dig = num % 10
    rev = rev * 10 + dig
    num = num // 10

if temp == rev :
    print ( "The Number Is A Palindrome!" )

else :
    print ( "The Number Isn't A Palindrome!" )