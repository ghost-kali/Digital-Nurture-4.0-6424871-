public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Base Notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS and Slack channels
        Notifier multiChannelNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(notifier));

        System.out.println("Notification via Email, SMS, and Slack:");
        multiChannelNotifier.send("System update scheduled at 2 AM.");
    }
}