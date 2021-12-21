package a04_Eingabe;

public interface Laengeneinheiten {
	double METER_IN_MILLIMETER = 1000;
	double METER_IN_ZENTIMETER = 100;
	double METER_IN_KILOMETER = 1.0 / 1000;

	double METER_IN_INCH = 1.0 / 2.54e-2; // 1 inch (Zoll) = 2,54cm
	double METER_IN_FOOT = 1.0 / 30.48e-2; // 1 foot = 30,48cm
	double METER_IN_YARD = METER_IN_FOOT / 3; // 1 yard = 3 FOOT
	double METER_IN_MILE = 1.0 / 1609; // 1 mile = 1609m
	double METER_IN_SEEMEILE = 1.0 / 1852.01; // 1Seemeile = 1852,01m

}