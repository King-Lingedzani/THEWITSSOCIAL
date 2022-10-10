package com.example.thewitssocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class editProfile extends AppCompatActivity {




    EditText nameET,surnameET, emailET,phoneET;
    String Dbname, DbsurName, DbeMail, DbpHone;


    DatabaseReference reference;

    String Etname, Etsurname, Etemail, Etphone;
    Intent data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        reference = FirebaseDatabase.getInstance().getReference("Users")
        ;//.child(FirebaseAuth.getInstance().getCurrentUser().getUid());


        String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();

        nameET = findViewById(R.id.editTextTextPersonName);
        surnameET = findViewById(R.id.editTextTextPersonSurName);
        emailET = findViewById(R.id.editTextTextEmailAddress);
        phoneET = findViewById(R.id.editTextPhone);




        data = getIntent();
        Bundle bun = data.getExtras();

        Dbname = data.getStringExtra("name");
        DbsurName = data.getStringExtra("surname");
        DbpHone = data.getStringExtra("phone");
        DbeMail = data.getStringExtra("email");



        nameET.setText(Dbname);
        surnameET.setText(DbsurName);
        emailET.setText((DbpHone));
        phoneET.setText(DbeMail);
        //
        //DbeMail = emailET.getText().toString();
        // = phoneET.getText().toString();



        // Etname = nameET.getText().toString();
        //  Etemail = emailET.getText().toString();
        //  Etsurname = surnameET.getText().toString();
        //   Etphone = phoneET.getText().toString();


    }

    public void update(View view) {


        Etname = nameET.getText().toString();
        Etemail = emailET.getText().toString();
        Etsurname = surnameET.getText().toString();
        Etphone = phoneET.getText().toString();

        if (isNameChanged(Dbname,Etname) || isSurnameChanged(DbsurName,Etsurname) || isPhoneChanged(DbpHone,Etphone) || isEmailChanged(DbeMail,Etemail) ){
            reference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("Name").setValue(Etname);
            reference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("Surname").setValue(Etsurname);
            reference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("PhoneNo").setValue(Etphone);
            reference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("Email").setValue(Etemail);
            Toast.makeText(getApplicationContext(),"Data changed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Nothing Changed", Toast.LENGTH_SHORT).show();
        }
    }


    public  Boolean isNameChanged(String Dname,String Ename){

        Dname = Dbname;
        Ename = Etname;
        if(!Dname.equals(Ename)){
            return  true;
        }else {
            return true;
        }
    }



    public  Boolean isSurnameChanged(String Dsurname,String Esurname){

        Dsurname = DbsurName;
        Esurname = Etsurname;

        if(!Dsurname.equals(Esurname)){
            return  true;
        }else {
            return false;
        }
    }

    public Boolean isEmailChanged(String Dmail,String Email){

        Dmail = DbeMail;
        Email = Etemail;

        if(!DbeMail.equals(Email)){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isPhoneChanged(String Dphone,String Ephone){
        Dphone = DbpHone;
        Ephone = Etphone;

        if(!Dphone.equals(Ephone)){
            return true;
        }else{
            return false;
        }
    }

}