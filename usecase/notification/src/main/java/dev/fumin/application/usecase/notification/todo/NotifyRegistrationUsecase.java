package dev.fumin.application.usecase.notification.todo;

import dev.fumin.application.usecase.notification.Recipient;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class NotifyRegistrationUsecase {

    private final RegistrationNotifier notifier;

    public NotifyRegistrationUsecase(RegistrationNotifier notifier) {
        this.notifier = notifier;
    }

    public boolean handle(String id) {
        Recipient recipient = new Recipient("hoge", "fuga@example.com", "000-0000-0000");
        RegistrationNotification notification = new RegistrationNotification(recipient, "title", "body");
        try {
            // Notifierの提供はアプリケーション層にして、メール内容の作成モジュールをプレゼンテーション層に提供させるのもあり。
            // app.EmailNotifier -> app.EmailPresenter<interface> <--- presen.HtmlEmailPresenter
            notifier.notify(notification);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
