package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        int countOfEggsPerMonth = 11;
        return countOfEggsPerMonth;
    }

    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.",
                super.getDescription(), Country.UKRAINE , getCountOfEggsPerMonth() );
    }

}