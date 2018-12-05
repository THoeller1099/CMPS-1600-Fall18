-- part 1a

outfits = ["(" ++ pant ++ ", " ++ top ++ ", " ++ shoe ++ ")" | pant <- ["jeans", "khakis"], top <- ["white shirt", "grey turtleneck", "pink polo", "green hoodie"], shoe <- ["brogues", "converse", "sandals"]]

-- part 1b / Increasing the amount of pants and shoes will yield the greatest increase in outfits

outfits' = ["(" ++ pant ++ ", " ++ top ++ ", " ++ shoe ++ ", " ++ scarf ++ ")" | pant <- ["jeans", "khakis"], top <- ["white shirt", "grey turtleneck", "pink polo", "green hoodie"], shoe <- ["brogues", "converse", "sandals"], scarf <- ["paisley", "knitloop"]]

-- added 2 options for scarves, which doubled the amount of outfits possible from 24 to 48

-- part 1c

l = ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."] ++ [x ++ " and " ++ y | x <- ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."], y <- ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."]]

-- part 1d

n = [('A',"Alfa"), ('B',"Bravo"), ('C',"Charlie"), ('D',"Delta"), ('E',"Echo"), ('F',"Foxtrot"), ('G',"Golf"), ('H', "Hotel"), ('I', "India"), ('J', "Juliett"), ('K', "Kilo"), ('L', "Lima"), ('M', "Mike"), ('N', "November"), ('O', "Oscar"), ('P', "Papa"), ('Q', "Quebec"), ('R', "Romeo"), ('S', "Sierra"), ('T',"Tango"), ('U',"Uniform"), ('V',"Victor"), ('W',"Whiskey"), ('X',"X-ray"), ('Y',"Yankee"), ('Z',"Zulu")]

