package task1.box;

import task1.sweetness.Sweetness;

public interface BoxOperations {
    void addSweetness(Sweetness sweetness);
    void deleteSweetness(Sweetness sweetness);
    void printWeightBox();
    void printPriceBox();
    void getInfoSweetness();
}
