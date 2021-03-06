package katas.mguzman;

public class BuyCar {

    public static int[] nbMonths(float startPriceOld, float startPriceNew, float savingperMonth, double percentLossByMonth) {
        percentLossByMonth = percentLossByMonth/100;
        float saved = 0;
        int month = 0;

        while(true){
            if(saved + startPriceOld >= startPriceNew){return new int[]{month, Math.round(saved+startPriceOld-startPriceNew)};}
            month++;
            if(month>0 && month%2==0){percentLossByMonth += 0.5/100; }

            saved += savingperMonth;
            startPriceOld = (startPriceOld - (float)(startPriceOld * percentLossByMonth));
            startPriceNew = (startPriceNew - (float)(startPriceNew * percentLossByMonth));
        }
    }
}
