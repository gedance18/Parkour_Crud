package com.company;

public class TraceursB {
  private int IDTraceur;
  private String nombre;
  private int edad;
  private float altura;
  private int experiencia;
  private GruposParkourA gruposParkourA;
  private enum Experto{
      GATO, PRECI, LONGITUD, FLUIDEZ, PRECISION
  }
  private Experto experto;




  public TraceursB(String nombre, int edad, float altura, int experiencia) {
    this.nombre = nombre;
    this.edad = edad;
    this.altura = altura;
    this.experiencia = experiencia;
   // this.experto = enumFormer(experto);

  }


  @Override
  public String toString() {
    String grupoName = "Sin Grupo";

    try{
      if(gruposParkourA.getNombre()!= null){
        grupoName = gruposParkourA.getNombre();
      }
    } catch (Exception e){

    }

    return "TraceursB{" +
            "IDTraceur=" + IDTraceur +
            ", nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", altura=" + altura +
            ", experiencia=" + experiencia +
            ", grupoParkourA=" + grupoName +
            ", experto=" + experto +
            '}';
  }

  public int getIDTraceur() {
    return IDTraceur;
  }

  public void setIDTraceur(int IDTraceur) {
    this.IDTraceur = IDTraceur;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public int getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }

  public GruposParkourA getGrupoParkour() {
    return gruposParkourA;
  }

  public void setGrupoParkour(GruposParkourA IDGrupoParkour) {
    this.gruposParkourA = IDGrupoParkour;
  }

  public Experto getExperto() {
    return experto;
  }

  public Experto enumFormer(String experto) {
    Experto r = null;
    for (Experto e: Experto.values()) {
      if (e.equals(experto)){
        r = e;
      }

    }
    return r;
  }
}
