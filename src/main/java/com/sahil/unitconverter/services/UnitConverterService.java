package com.sahil.unitconverter.services;

import org.springframework.stereotype.Service;

@Service
public class UnitConverterService
{
    public double convertLength(double value, String from, String to)
    {
        double result = 0.0;
        double meters = 0.0;

        switch (from)
        {
            case "millimeter":
            {
                meters = value / 1000;
                break;
            }
            case "centimeter":
            {
                meters = value / 100;
                break;
            }
            case "meter":
            {
                meters = value;
                break;
            }
            case "kilometer":
            {
                meters = value * 1000;
                break;
            }
            case "inch":
            {
                meters = value * 0.0254;
                break;
            }
            case "foot":
            {
                meters = value * 0.3048;
                break;
            }
            case "yard":
            {
                meters = value * 0.9144;
                break;
            }
            case "mile":
            {
                meters = value * 1609.344;
                break;
            }
        }

        switch (to)
        {
            case "millimeter":
            {
                result = meters * 1000;
                break;
            }
            case "centimeter":
            {
                result = meters * 100;
                break;
            }
            case "meter":
            {
                result = meters;
                break;
            }
            case "kilometer":
            {
                result = meters / 1000;
                break;
            }
            case "inch":
            {
                result = meters / 0.0254;
                break;
            }
            case "foot":
            {
                result = meters / 0.3048;
                break;
            }
            case "yard":
            {
                result = meters / 0.9144;
                break;
            }
            case "mile":
            {
                result = meters / 1609.344;
                break;
            }
        }

        return result;
    }

    public double convertWeight(double value, String from, String to)
    {
        double result = 0.0;
        double grams = 0.0;

        switch (from)
        {
            case "milligram":
            {
                grams = value / 1000;
                break;
            }
            case "gram":
            {
                grams = value;
                break;
            }
            case "kilogram":
            {
                grams = value * 1000;
                break;
            }
            case "ounce":
            {
                grams = value * 28.349523125;
                break;
            }
            case "pound":
            {
                grams = value * 453.59237;
                break;
            }
        }

        switch (to)
        {
            case "milligram":
            {
                result = grams * 1000;
                break;
            }
            case "gram":
            {
                result = grams;
                break;
            }
            case "kilogram":
            {
                result = grams / 1000;
                break;
            }
            case "ounce":
            {
                result = grams / 28.349523125;
                break;
            }
            case "pound":
            {
                result = grams / 453.59237;
                break;
            }
        }

        return result;
    }

    public double convertTemperature(double value, String from, String to) {
        double celsius = 0.0;
        double result = 0.0;

        switch (from) {
            case "celsius":
            {
                celsius = value;
                break;
            }
            case "fahrenheit":
            {
                celsius = (value - 32) * 5 / 9;
                break;
            }
            case "kelvin":
            {
                celsius = value - 273.15;
                break;
            }
        }

        switch (to) {
            case "celsius":
            {
                result = celsius;
                break;
            }
            case "fahrenheit":
            {
                result = (celsius * 9 / 5) + 32;
                break;
            }
            case "kelvin":
            {
                result = celsius + 273.15;
                break;
            }
        }

        return result;
    }
}
