package againlesson;

import serialization.User;

public class Manager extends Employeer {
    private Integer teamsize;
    public Manager(String name, double salary,Integer teamsize) {

        super(name, salary);
        this.teamsize = teamsize;
    }

    public Integer getTeamsize() {
        return teamsize;
    }


}
