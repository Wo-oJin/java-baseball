package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

    private final int NUMBERS_LENGTH = 3;
    private final int START_INCLUSIVE = 0;
    private final int FINISH_INCLUSIVE = 9;

    private InputValidation inputValidation = new InputValidation();

    /**
     * NUMBER_LENGTH 크기의 랜덤한 숫자를 생성해 반환
     * @return 컴퓨터가 사용할 랜덤한 숫자
     */
    public String getRandomNumber() {

        String randomNumber = "";

        for(int i = 0; i < NUMBERS_LENGTH; i++) {
            String pickNumber = String.valueOf(Randoms.pickNumberInRange(START_INCLUSIVE, FINISH_INCLUSIVE));

            if(randomNumber.contains(pickNumber)) {
                i--;
            } else {
                randomNumber += pickNumber;
            }
        }

        return randomNumber;
    }

}
