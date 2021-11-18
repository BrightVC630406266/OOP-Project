package package02;

public class Enemy_Goblin extends SuperEnemy{
    public Enemy_Goblin(){

        name = "Goblin";
        currentWeapon = new Weapon_Club();
        hp = 50;
        atk = currentWeapon.damage;
        goldDrop = 20;

    }
}
