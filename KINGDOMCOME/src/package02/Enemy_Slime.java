package package02;

public class Enemy_Slime extends SuperEnemy{
    public Enemy_Slime(){
        name = "Slime";
        hp = 10;
        currentWeapon = new Weapon_Slime();
        atk = currentWeapon.damage;
        goldDrop = 5;
    }
}
