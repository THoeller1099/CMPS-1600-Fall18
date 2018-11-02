import java.util.ArrayList;

public class myLong {
    public ArrayList<Integer> numberList;
    public String myNum;


    public myLong() {
        numberList = new ArrayList<>();
        myNum = "";
    }

    public void setLong(String number) {

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int temp = Character.getNumericValue(c);
            this.numberList.add(temp);
        }

    }

    @Override
    public String toString() {
        for (Integer num : numberList) {
            String temp = num.toString();
            myNum = myNum + temp;
        }
        return myNum;
    }

    public int size() {
        return numberList.size();
    }

    public myLong add(myLong other) {
        myLong newNum = new myLong();

        this.makeSizeEqual(other);

        for (int i = 0; i < this.size(); i++) {
            int num1 = this.numberList.get(numberList.size() - 1 - i);
            int num2 = other.numberList.get(numberList.size() - 1 - i);
            int addedNum = num1 + num2;
            if (addedNum > 9) {
                if (this.numberList.size() - 1 - i == 0) {
                    newNum.numberList.add(0, addedNum);
                    break;
                }
                int remainder = addedNum - 10;
                this.numberList.set(numberList.size() - 2 - i, (this.numberList.get(numberList.size() - 2 - i) + 1));
                newNum.numberList.add(0, remainder);
            } else {
                newNum.numberList.add(0, addedNum);
            }
        }
        this.numberList = newNum.numberList;
        return newNum;
    }

    public boolean isLarger(myLong other) {
        this.makeSizeEqual(other);

        for (int i = 0; i < this.size(); i++) {
            if (this.numberList.get(i) > other.numberList.get(i)) {
                return true;
            }
            if (other.numberList.get(i) > this.numberList.get(i)) {
                return false;
            }
        }
        return false;
    }

    public void makeSizeEqual(myLong other) {
        if (this.size() != other.size()) {
            if (this.size() > other.size()) {
                int zeros = this.size() - other.size();
                for (int i = 0; i < zeros; i++) {
                    other.numberList.add(0, 0);
                }
            }
            if (other.size() > this.size()) {
                int zeros = other.size() - this.size();
                for (int i = 0; i < zeros; i++) {
                    this.numberList.add(0, 0);
                }
            }
        }
    }

    public myLong subtract(myLong other) {
        myLong newNum = new myLong();

        this.makeSizeEqual(other);

        int subtractedNum;
        int num1;
        int num2;
        if (this.isLarger(other)) {
            for (int i = 0; i < this.size(); i++) {
                num1 = this.numberList.get(numberList.size() - 1 - i);
                num2 = other.numberList.get(numberList.size() - 1 - i);
                subtractedNum = num1 - num2;
                if (subtractedNum < 0) {
                    this.numberList.set(numberList.size() - 2 - i, (this.numberList.get(numberList.size() - 2 - i) - 1));
                    this.numberList.set(numberList.size() - 1 - i, (this.numberList.get(numberList.size() - 1 - i) + 10));
                    int addedNum = (this.numberList.get(numberList.size() - 1 - i));
                    int newSubtractedNum = addedNum - other.numberList.get(numberList.size() - 1 - i);
                    newNum.numberList.add(0, newSubtractedNum);
                } else {
                    newNum.numberList.add(0, subtractedNum);
                }
            }
        }
        if (!this.isLarger(other)) {
            for (int i = 0; i < this.size(); i++) {
                num1 = this.numberList.get(numberList.size() - 1 - i);
                num2 = other.numberList.get(numberList.size() - 1 - i);
                subtractedNum = num2 - num1;
                if (subtractedNum < 0) {
                    other.numberList.set(numberList.size() - 2 - i, (other.numberList.get(numberList.size() - 2 - i) - 1));
                    other.numberList.set(numberList.size() - 1 - i, (other.numberList.get(numberList.size() - 1 - i) + 10));
                    int addedNum = (other.numberList.get(numberList.size() - 1 - i));
                    int newSubtractedNum = addedNum - this.numberList.get(numberList.size() - 1 - i);
                    newNum.numberList.add(0, newSubtractedNum);
                } else {
                    newNum.numberList.add(0, subtractedNum);
                }
            }
            newNum.myNum = "-" + newNum.myNum;
        }
        return newNum;
    }

    public myLong multiply(myLong other) {
        myLong newNum = new myLong();

        newNum.setLong("0");
        for (Integer number : other.numberList) {
            int zeros = other.numberList.size() - other.numberList.indexOf(number) - 1;
            myLong addThis = new myLong();
            addThis.setLong("0");

            while (number > 0) {
                addThis.add(this);
                number = number - 1;
            }

            while (zeros > 0) {
                addThis.numberList.add(0);
                zeros = zeros - 1;
            }

            newNum.add(addThis);

        }
        return newNum;
    }
}
