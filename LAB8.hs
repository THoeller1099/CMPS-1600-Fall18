-- Returns the last digit of an integer
lastDigit :: Integer -> Integer
lastDigit 0 = 0
lastDigit n = mod n 10

-- Returns the integer with the last digit dropped from the integer
dropLastDigit :: Integer -> Integer
dropLastDigit n = div n 10

-- Returns the integer in a list form in reverse order using the previous two functions
toRevDigits :: Integer -> [Integer]
toRevDigits n
    | n <= 0 = []
    | otherwise = lastDigit n : toRevDigits (dropLastDigit n)

-- Doubles every other digit in the list
doubleEveryOther :: [Integer] -> [Integer]
doubleEveryOther [] = []
doubleEveryOther (x:[]) = [x]
doubleEveryOther (x:i:k) = x:(i*2):doubleEveryOther k

-- Takes a sum of all of the digits in the list
sumDigits :: [Integer] -> Integer
sumDigits [] = 0
sumDigits (x:[]) = x
sumDigits (x:i) = lastDigit x + dropLastDigit x + sumDigits i

-- The function for the whole luhn process. Returns true if the sum of the double of every other digit is divisible by 10
luhn :: Integer -> Bool
luhn n
    | sumDigits (doubleEveryOther (toRevDigits n)) `mod` 10 == 0 = True
    | otherwise = False

