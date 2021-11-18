package package02;

public class Enemy_Witch extends SuperEnemy{
    public Enemy_Witch(){
        name = "Witch";
        currentWeapon = new Weapon_FireBall();
        hp = 20;
        atk = currentWeapon.damage;
        goldDrop = 60;
    }
}
