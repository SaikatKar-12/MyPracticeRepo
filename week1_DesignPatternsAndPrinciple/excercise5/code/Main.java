public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("--- Sending via Email only ---");
        emailNotifier.send("Hello via Email!");

        System.out.println("\n--- Sending via Email + SMS ---");
        smsNotifier.send("Hello via Email and SMS!");

        System.out.println("\n--- Sending via Email + SMS + Slack ---");
        slackNotifier.send("Hello via Email, SMS, and Slack!");
    }
} 