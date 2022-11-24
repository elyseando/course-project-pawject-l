package useCase;
import entities.User;
import entities.Report;
import entities.Pet;
import repo.ChatDataAccessInterface;
import repo.PetDataAccessInterface;
import repo.UserDataAccessInterface;

import java.io.IOException;

public class ReportInteractor {
    private PetDataAccessInterface pm;
    private ChatDataAccessInterface cm;
    private UserDataAccessInterface um;
    public ReportInteractor(PetDataAccessInterface pm, ChatDataAccessInterface cm, UserDataAccessInterface um){
        this.pm = pm;
        this.cm = cm;
        this.um = um;
    }
    public void TypeAReport(String userID) throws IOException {
        Report r = new Report(userID, "TypeA", um);
        r.report();
    }
    public void TypeBReport(String petID) throws IOException {
        Report r = new Report(petID, "TypeB", pm, um);
        r.report();
    }
    public void TypeCReport(String petID, String chatId) {
        Report r = new Report(petID, chatId,"TypeC", pm,cm);
        r.report();
    }
}
