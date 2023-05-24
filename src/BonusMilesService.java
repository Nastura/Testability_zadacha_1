public class BonusMilesService {

    // принимает на вход один параметр: цену билета, типа int;
    // анализируя значение переданного параметра, возвращает рассчитанное количество миль.

    public int calculate(int price) {
        int mili;
        if (price > 20) {
            mili = price / 20;
        } else {
            mili = 0;
        }
        return mili;
    }
}
