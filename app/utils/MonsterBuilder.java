package utils;

import models.Family;
import models.Monster;
import play.data.DynamicForm;

public class MonsterBuilder {

    private final Monster monster;

    public MonsterBuilder() {
        monster = new Monster();
    }

    public MonsterBuilder(Monster monster) {
        this.monster = monster;
    }

    public Monster build() {
        return monster;
    }

    public MonsterBuilder update(DynamicForm form){
        monster.setName(form.get("name"));

        monster.setNum(form.get("num") == null ? null : Integer.valueOf(form.get("num")));
        monster.setDescription(form.get("description"));
        monster.setFamily1(form.get("family1") == null ? null : Family.FIND.query().where().eq("name", form.get("family1")).findOne());
        monster.setFamily2(form.get("family2") == null ? null : Family.FIND.query().where().eq("name", form.get("family2")).findOne());
        monster.setPreEvolutionId(form.get("num") == null ? null : Integer.valueOf(form.get("preEvolutionId")));
        monster.setHp(form.get("hp") == null ? null : Integer.valueOf(form.get("hp")));
        monster.setSp(form.get("sp") == null ? null : Integer.valueOf(form.get("sp")));
        monster.setAtk(form.get("atk") == null ? null : Integer.valueOf(form.get("atk")));
        monster.setDef(form.get("def") == null ? null : Integer.valueOf(form.get("def")));
        monster.setStrength(form.get("strength") == null ? null : Integer.valueOf(form.get("strength")));
        monster.setDexterity(form.get("dexterity") == null ? null : Integer.valueOf(form.get("dexterity")));
        monster.setIntellect(form.get("intellect") == null ? null : Integer.valueOf(form.get("intellect")));
        monster.setAgility(form.get("agility") == null ? null : Integer.valueOf(form.get("agility")));
        monster.setLuck(form.get("luck") == null ? null : Integer.valueOf(form.get("luck")));
        return this;
    }

    public MonsterBuilder update(Monster monster) {
        this.monster.setName(monster.getName());
        this.monster.setNum(monster.getNum());
        this.monster.setDescription(monster.getDescription());
        this.monster.setFamily1(monster.getFamily1());
        this.monster.setFamily2(monster.getFamily2());
        this.monster.setPreEvolutionId(monster.getPreEvolutionId());
        this.monster.setHp(monster.getHp());
        this.monster.setSp(monster.getSp());
        this.monster.setAtk(monster.getAtk());
        this.monster.setDef(monster.getDef());
        this.monster.setStrength(monster.getStrength());
        this.monster.setDexterity(monster.getDexterity());
        this.monster.setIntellect(monster.getIntellect());
        this.monster.setAgility(monster.getAgility());
        this.monster.setLuck(monster.getLuck());
        return this;
    }

    public MonsterBuilder appendName(String name) {
        monster.setName(name);
        return this;
    }

    public MonsterBuilder appendNumber(Integer number) {
        monster.setNum(number);
        return this;
    }

    public MonsterBuilder appendDescription(String description) {
        monster.setDescription(description);
        return this;
    }

    public MonsterBuilder appendFamily1(Family family) {
        monster.setFamily1(family);
        return this;
    }

    public MonsterBuilder appendFamily2(Family family) {
        monster.setFamily2(family);
        return this;
    }

    public MonsterBuilder appendPreEvolutionId(Integer id) {
        monster.setPreEvolutionId(id);
        return this;
    }

    public MonsterBuilder appendHp(Integer hp) {
        monster.setHp(hp);
        return this;
    }

    public MonsterBuilder appendSp(Integer sp) {
        monster.setSp(sp);
        return this;
    }

    public MonsterBuilder appendAtk(Integer atk) {
        monster.setAtk(atk);
        return this;
    }

    public MonsterBuilder appendDef(Integer def) {
        monster.setDef(def);
        return this;
    }

    public MonsterBuilder appendStrength(Integer strength) {
        monster.setStrength(strength);
        return this;
    }

    public MonsterBuilder appendDexterity(Integer dexterity) {
        monster.setDexterity(dexterity);
        return this;
    }

    public MonsterBuilder appendIntellect(Integer intellect) {
        monster.setIntellect(intellect);
        return this;
    }

    public MonsterBuilder appendAgility(Integer agility) {
        monster.setAgility(agility);
        return this;
    }

    public MonsterBuilder appendLuck(Integer luck) {
        monster.setLuck(luck);
        return this;
    }
}
