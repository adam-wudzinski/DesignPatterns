package structural.facade;


public class RegistrationFacade {

    public void registerUser(User userData, String email) {
        Validator validator = new Validator();
        validator.validateUser(userData);

        Persistence persistence = new Persistence();
        persistence.save(userData);

        EmailNotifier notifier = new EmailNotifier();
        notifier.notify(email);
    }
}
