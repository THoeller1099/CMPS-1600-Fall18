-- part 2a

remainder x y = x `mod` y

-- part 2b

isEven :: Int -> Bool
isEven x
    | remainder x 2 == 1 = False
    | remainder x 2 == 0 = True

-- part 2c

mergeSort :: Ord a => [a] -> [a] -> [a]
mergeSort xs [] = xs
mergeSort [] xs = xs
mergeSort (a:first) (b:second)
                   | a <= b = a:mergeSort first (b:second)
                   | a > b = b:mergeSort (a:first) second

-- part 2d

removeMultiple :: (Integral a) => [a] -> a -> [a]
removeMultiple [] x = []
removeMultiple (y:ys) x
               | remainder y x == 0 = removeMultiple ys x
               | otherwise = y:removeMultiple ys x

