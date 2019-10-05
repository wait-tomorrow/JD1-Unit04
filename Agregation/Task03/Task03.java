package by.htp.Aggregation.Task03;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, 
 * площадь, областные центры.
 */

public class Task03 {

    public static void main(String[] args) {
	Country belarus = CountryLogic.createBelarus();

	System.out.println("Столица: " + CountryLogic.getCapitalName(belarus));
	System.out.println("Количество областей: " + CountryLogic.calculateRegionCount(belarus));
	System.out.println("\nОбластные центры: " + CountryLogic.getRegionsCentersCities(belarus));
	System.out.println("\nПлощадь страны: " + CountryLogic.calculateCountryArea(belarus));
    }
}
