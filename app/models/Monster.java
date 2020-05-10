package models;

import io.ebean.Finder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Monster extends GenericModel {

    public static final Finder<Integer, Monster> FIND = new Finder<>(Monster.class);

    private String name;
    private Integer num;
    private String description;

    @ManyToOne(optional = false)
    @Column(name = "family_id_1")
    private Family family1;

    @ManyToOne
    @Column(name = "family_id_2")
    private Family family2;

    @Column(name = "pre_evolution_id")
    private Integer preEvolutionId;

    private Integer hp;
    private Integer sp;
    private Integer atk;
    private Integer def;
    private Integer strength;
    private Integer dexterity;
    private Integer intellect;
    private Integer agility;
    private Integer luck;

    public Monster() {}

    public Monster(String name, Integer num, String description, Family family1, Family family2, Integer preEvolutionId, Integer hp, Integer sp, Integer atk, Integer def, Integer strength, Integer dexterity, Integer intellect, Integer agility, Integer luck) {
        this.name = name;
        this.num = num;
        this.description = description;
        this.family1 = family1;
        this.family2 = family2;
        this.preEvolutionId = preEvolutionId;
        this.hp = hp;
        this.sp = sp;
        this.atk = atk;
        this.def = def;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intellect = intellect;
        this.agility = agility;
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Family getFamily1() {
        return family1;
    }

    public void setFamily1(Family family1) {
        this.family1 = family1;
    }

    public Family getFamily2() {
        return family2;
    }

    public void setFamily2(Family family2) {
        this.family2 = family2;
    }

    public Integer getPreEvolutionId() {
        return preEvolutionId;
    }

    public void setPreEvolutionId(Integer preEvolutionId) {
        this.preEvolutionId = preEvolutionId;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }
}
