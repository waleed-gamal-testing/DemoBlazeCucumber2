package utils;

import com.github.javafaker.Faker;

public class FakeDataGenerator {

    private static final Faker faker = new Faker();

    public static String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateFakeName() {
        return faker.name().fullName();
    }

    public static String generateFakePassword() {
        return faker.internet().password(8, 16);
    }
}
