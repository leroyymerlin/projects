package org.example;


public class NumberToWordsFormatter {

    public String numToString(Integer sum) {

        sum = 156415511;

        int degreeOfNumberCount = 3; // максимальная степень числа

// массив для хранения окончаний степеней числа
        String[][] degreeOfNumber = new String[][]{

                {"0", "", "", ""},  // 1

                {"1", "тысяча ", "тысячи ", "тысяч "},  // 2

                {"0", "миллион ", "миллиона ", "миллионов "},  // 3

                {"0", "миллиард ", "миллиарда ", "миллиардов "}  // 4

        };

        //массив для преобразования цифр в слова. Первый индекс - цифра от 0 до 9, второй индекс - тип (единницы, десятки, сотни)
        String[][] digits = new String[][]{

                {"", "", "десять ", "", ""},
                {"один ", "одна ", "одиннадцать ", "десять ", "сто"},
                {"два ", "две ", "двенадцать ", "двадцать ", "двести "},
                {"три ", "три ", "тринадцать ", "тридцать ", "триста "},
                {"четыре ", "четыре ", " четырнадцать ", "сорок ", "четыреста "},
                {"пять ", "пять ", "пятнадцать ", "пятьдесят ", "пятьсот "},

                {"шесть ", "шесть ", "шестнадцать ", "шестьдесят ", "шестьсот "},

                {"семь ", "семь ", "семнадцать ", "семьдесят ", "семьсот "},

                {"восемь ", "восемь ", "восемнадцать ", "восемьдесят ", "восемьсот "},

                {"девять ", "девять ", "девятнадцать ", "девяносто ", "девятьсот "}

        };


        int i; // для итерации по степеням числа

        int mny; // хранит текущую группу цифр (напр. сотни тысяч)

        StringBuffer result = new StringBuffer("");

        long divisor; //делитель на группы по 1000
        int one = 1;
        int psum = sum;

        for (i = 0, divisor = 1; i < degreeOfNumberCount; i++) {

            divisor *= 1000;

        }


        for (i = degreeOfNumberCount - 1; i >= 0; i--) {

            divisor /= 1000;

            mny = (int) (psum / divisor);

            psum %= divisor;

            //str="";

            if (mny == 0) {

                if (i > 0) {

                    continue;

                }

                result.append(degreeOfNumber[i][one]);

            } else {

                if (mny >= 100) {

                    int hun = 3;
                    result.append(digits[mny / 100][hun]);

                    mny %= 100;

                }

                if (mny >= 20) {

                    int dec = 1;
                    result.append(digits[mny / 10][dec]);

                    mny %= 10;

                }

                if (mny >= 10) {

                    int dec2 = 1;
                    result.append(digits[mny - 10][dec2]);

                } else {

                    if (mny >= 1) {

                        result.append(digits[mny]["0".equals(degreeOfNumber[i][0]) ? 0 : 1]);

                    }

                }

                switch (mny) {

                    case 1:

                        result.append(degreeOfNumber[i][one]);

                        break;

                    case 2:

                    case 3:

                    case 4:

                        int four = 4;
                        result.append(degreeOfNumber[i][four]);

                        break;

                    default:

                        int many = 5;
                        result.append(degreeOfNumber[i][many]);

                        break;

                }
                ;

            }

        }

        return result.toString();

    }


}
