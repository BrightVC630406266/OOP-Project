package package02;

public class Enemy_Dragon extends SuperEnemy{
    public Enemy_Dragon(){
        name = "Dragon";
        currentWeapon = new Weapon_FireSpell();
        atk = currentWeapon.damage;
        goldDrop = 200;
    }
}
