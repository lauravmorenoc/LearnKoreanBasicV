/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendecoreano.version1;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura M
 */
public class Main {
    
    private ArrayList<ArrayList<String>> profesiones;
    
    private ArrayList<ArrayList<String>> paisesYciudades;
    
    private ArrayList<ArrayList<String>> verbosYadjetivos;
    
    private ArrayList<ArrayList<String>> animales;
    
    private ArrayList<ArrayList<String>> comida;
    
    private ArrayList<ArrayList<String>> idiomas;
    
    private ArrayList<ArrayList<String>> sustantivosVarios;
    
    private ArrayList<String> opcionesIniciales;

    public ArrayList<ArrayList<String>> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(ArrayList<ArrayList<String>> profesiones) {
        this.profesiones = profesiones;
    }

    public ArrayList<ArrayList<String>> getPaisesYciudades() {
        return paisesYciudades;
    }

    public void setPaisesYciudades(ArrayList<ArrayList<String>> paisesYciudades) {
        this.paisesYciudades = paisesYciudades;
    }

    public ArrayList<ArrayList<String>> getVerbosYadjetivos() {
        return verbosYadjetivos;
    }

    public void setVerbosYadjetivos(ArrayList<ArrayList<String>> verbosYadjetivos) {
        this.verbosYadjetivos = verbosYadjetivos;
    }

    public ArrayList<ArrayList<String>> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<ArrayList<String>> animales) {
        this.animales = animales;
    }

    public ArrayList<ArrayList<String>> getComida() {
        return comida;
    }

    public void setComida(ArrayList<ArrayList<String>> comida) {
        this.comida = comida;
    }

    public ArrayList<ArrayList<String>> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<ArrayList<String>> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<ArrayList<String>> getSustantivosVarios() {
        return sustantivosVarios;
    }

    public void setSustantivosVarios(ArrayList<ArrayList<String>> sustantivosVarios) {
        this.sustantivosVarios = sustantivosVarios;
    }

    public ArrayList<String> getOpcionesIniciales() {
        return opcionesIniciales;
    }

    public void setOpcionesIniciales(ArrayList<String> opcionesIniciales) {
        this.opcionesIniciales = opcionesIniciales;
    }

    public Main(ArrayList<ArrayList<String>> profesiones, ArrayList<ArrayList<String>> paisesYciudades, ArrayList<ArrayList<String>> verbosYadjetivos, ArrayList<ArrayList<String>> animales, ArrayList<ArrayList<String>> comida, ArrayList<ArrayList<String>> idiomas, ArrayList<ArrayList<String>> sustantivosVarios, ArrayList<String> opcionesIniciales) {
        this.profesiones = profesiones;
        this.paisesYciudades = paisesYciudades;
        this.verbosYadjetivos = verbosYadjetivos;
        this.animales = animales;
        this.comida = comida;
        this.idiomas = idiomas;
        this.sustantivosVarios = sustantivosVarios;
        this.opcionesIniciales = opcionesIniciales;
    }
    //public String[][] opcionElegida;
    //public int contadora;
    /*public void play(int opcion){
       // String [][] opcionElegida;
        switch (opcion){
                case 0:
                    opcionElegida=this.profesiones;
                    break;
                case 1:
                    opcionElegida=this.paisesYciudades;
                    break;
                case 2:
                    opcionElegida=this.verbosYadjetivos;
                    break;
                case 3:
                    opcionElegida=this.animales;
                    break;
                case 4:
                    opcionElegida=this.comida;
                    break;
                case 5:
                    opcionElegida=this.idiomas;
                    break;
                case 6:
                    opcionElegida=this.sustantivosVarios;
                    break;
                case 7:
                    contadora=this.profesiones.length;
                    for(int n=0; n<contadora; n++){
                    opcionElegida[n][0]=this.profesiones[n][0];
                    opcionElegida[0][n]=this.profesiones[0][n];
                    }
                    contadora+=this.paisesYciudades.length;
                    for(int n=profesiones.length; n<contadora; n++){
                    opcionElegida[n][0]=this.paisesYciudades[n][0];
                    opcionElegida[0][n]=this.paisesYciudades[0][n];
                    }
                    contadora+=this.verbosYadjetivos.length;
                    for(int n=contadora-this.verbosYadjetivos.length; n<contadora; n++){
                    opcionElegida[n][0]=this.verbosYadjetivos[n][0];
                    opcionElegida[0][n]=this.verbosYadjetivos[0][n];
                    }
                    contadora+=this.animales.length;
                    for(int n=contadora-this.animales.length; n<contadora; n++){
                    opcionElegida[n][0]=this.animales[n][0];
                    opcionElegida[0][n]=this.animales[0][n];
                    }
                    contadora+=this.comida.length;
                    for(int n=contadora-this.comida.length; n<contadora; n++){
                    opcionElegida[n][0]=this.comida[n][0];
                    opcionElegida[0][n]=this.comida[0][n];
                    }
                    contadora+=this.idiomas.length;
                    for(int n=contadora-this.idiomas.length; n<contadora; n++){
                    opcionElegida[n][0]=this.idiomas[n][0];
                    opcionElegida[0][n]=this.idiomas[0][n];
                    }
                    contadora+=this.sustantivosVarios.length;
                    for(int n=contadora-this.sustantivosVarios.length; n<contadora; n++){
                    opcionElegida[n][0]=this.sustantivosVarios[n][0];
                    opcionElegida[0][n]=this.sustantivosVarios[0][n];
                    }
                    
                default:
                    System.out.println("Not working");
    }
        for(int cont=0; cont<2147483646; cont++){
        int numero = (int) (Math.random() * opcionElegida.length);
        while(numero>=opcionElegida.length){
             numero--;
        }
        String respuestaIngresada="Hola";
        while(!respuestaIngresada.equals(opcionElegida[numero][1])){
        respuestaIngresada=JOptionPane.showInputDialog(opcionElegida[numero][0]);
        if(!respuestaIngresada.equals(opcionElegida[numero][1])){
            String opciones[]={"Reintentar", "Mostrar respuesta"};
            int selection=JOptionPane.showOptionDialog(null, "Respuesta incorrecta", "Mensaje", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (selection==1){
                JOptionPane.showMessageDialog(null, opcionElegida[numero][0]+" significa " + opcionElegida[numero][1]);
                respuestaIngresada=opcionElegida[numero][1];
            }
        }
        }
    }
    }*/
    
    
    public static void main(String[] args) {
        
    ArrayList<ArrayList<String>> profesiones= new ArrayList<ArrayList<String>>();
    
    {{"Ingeniero", "엔지니어"},
        {"Medico", "의사"},
        {"Cantante", "가수"}, 
        {"Cocinero", "요리사"}, 
        {"Mesero", "웨이터"}, 
        {"Policia", "경찰서"}, 
        {"Bombero", "소방서"}, 
        {"Oficinista", "위사원"}, 
        {"Actor", "영화배우"},
        {"Estudiante", "학생"},
        {"Empleado de banco", "은행원"},
        {"Ama de casa", "주부"}
    };
    
    String[][] paisesYciudades= {
        {"Argentina", "아르헨티나"}, 
        {"Australia", "호주"}, 
        {"Bogota", "보고타"},
        {"Canada", "캐나다"}, 
        {"China", "주국"},
        {"Colombia", "콜롬비아"}, 
        {"Corea", "한국"}, 
        {"Estados Unidos", "미국"}, 
        {"Francia", "브랑세"}, 
        {"Inglaterra", "영국"}, 
        {"Italia", "이탈리아"}, 
        {"Japon", "일본"}, 
        {"Mexico", "멕시코"}, 
        {"Mongolia", "몬골"},
        {"Rusia", "러시아"}, 
        {"Seul", "서울"},
        {"Tailandia", "태국"},
        {"Turquía", "터키"}, 
        {"Vietnam", "베트남"},
    };
    
    String[][] verbosYadjetivos={
        {"Aburrido", "재미없다"},
        {"Barato", "싸다"},
        {"Beber", "마시다"}, 
        {"Cantar", "노래"},
        {"Caro", "비싸다"},
        {"Comer", "먹다"}, 
        {"Delicioso", "마싰다"},
        {"Descansar", "쉬다"},
        {"Dormir", "자다"}, 
        //{"Escribir", ""}, 
        {"Escuchar", "듣다"}, 
        {"Estudiar", "공부하다"},
        {"Hacer ejercicio", "운동하다"},
        {"Interesante", "재미있다"},
        {"Ir", "가다"}, 
        {"Largo", "길다"},
        {"Leer", "읽다"},
        {"Llamar", "전화하다"},
        //{"Montarse/Subirse", ""},
        {"Mucho", "많다"},
        {"Observar", "보다"},
        {"Pequeño", "작다"},
        {"Ser", "이다"}, 
        {"Venir", "오다"}, 
        {"Vivir", "살다"}
    };
    
    String[][] animales={
        {"Zorro", "여우"}, 
        {"Leon", "사자"}, 
        {"Perro", "개"}, 
        {"Cerdo", "돼지"}, 
        {"Conejo", "토끼"}, 
        {"Elefante", "코끼리"}, 
        {"Caballo", "말"}
    };
    
    String[][] comida={
        {"Arroz", "밥"},
        {"Banano", "바나나"},
        {"Cafe (bebida)", "커피"}, 
        {"Leche", "우유"}, 
        {"Manzana", "사과"}, 
        {"Pan", "빵"},
        {"Pepino", "우이"}, 
        {"Sopa", "찌개"}, 
    };
    
    String[][] idiomas={
        {"Coreano", "한국어"},
        {"Español", "스페인어"},
        {"Ingles", "영어"},
        {"Japones", "일본어"}
    };
    
    String[][] sustantivosVarios={
        {"Afuera", "밖"},
        {"Amable", "예삐다"}, 
        {"Amigo", "친구"},
        {"Arbol", "나무"},
        {"Cabeza", "머이"},
        {"Casa", "집"},
        {"Celular (comun)", "핸느폰"},
        {"Celular (examen)", "휴대선화"},
        {"Cintura", "허리"},
        {"Cocina", "부엌"},
        {"Cola", "꼬리"},
        {"Computador", "컴퓨터"},
        {"Cuaderno", "공첵"},
        {"Cuerpo", "몸"},
        {"Diccionario", "사전"},
        {"Dia", "낮"},
        {"Direccion", "주소"},
        {"Email", "에마일"},
        {"Empresa", "시과"},
        {"Escritorio", "책상"}, 
        {"Escuela", "하겨"},
        {"Estudio", "공부"},
        {"Final", "끝"}, 
        {"Flor", "꽃"}, 
        {"Frente (parte delantera)", "앞"}, 
        {"Frio", "추워요"},
        {"Futbolista", "축구선수"},
        {"Habitacion", "방"},
        {"Helado", "아이스크림"},
        {"Hombre", "남자"},
        {"Isla", "섬"}, 
        {"Jabon", "비누"},
        {"Kimchi", "김치"},
        {"Lapiz", "연필"}, 
        {"Libro", "책"},  
        {"Maleta", "가방"}, 
        {"Montaña", "산"}, 
        {"Mujer", "여자"},
        {"Musica", "음악"},
        {"Nieve", "눈"},
        {"Niño", "아이"},  
        {"Nombre", "이름"},
        {"Oficina", "사무실"},
        {"Oreja", "귀"},  
        {"Pantalones", "바지"}, 
        {"Patada", "차다"}, 
        {"Pelicula", "영화"},
        {"Pelota", "공"},
        {"Periodico", "신문"},
        {"Persona", "사람"},
        {"Profesion", "직업"},
        {"Que", "무엇"},
        {"Quien", "누구"},
        {"Radio", "라디오"},
        {"Reloj", "시계"},
        {"Ropa", "옷"},
        {"Saludos", "인사 나누기"},
        {"Silla", "의자"}, 
        {"Sombrero", "모자"},
        {"Sombrilla", "우산"},
        {"Telefono", "전화"},
        {"Television", "텔레비전"},
        {"Tijeras", "사위"}, 
        {"Trenza", "짜다"}, 
        {"Ultima vocal", "받침"},
        {"Universidad", "데하겨"},
        {"Zapatos", "구두"},  
    };
    String[] opcionesIniciales={"Vocabulario", "Oraciones"};
    Main objeto=new Main(profesiones, paisesYciudades, verbosYadjetivos, animales, comida, idiomas, sustantivosVarios, opcionesIniciales);
    
    String[] opcionesSecundarias1={"Profesiones", "Paises Y Ciudades", "Verbos Y Adjetivos", "Animales", "Comida", "Idiomas", "Sustantivos Varios", "Todas las opciones"};
    int selection=JOptionPane.showOptionDialog(null, "Elige una opcion", "Bienvenido", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, objeto.getOpcionesIniciales(), objeto.getOpcionesIniciales()[0]);
        System.out.println(objeto.profesiones.length);
    if(selection==0){
        int selection2=JOptionPane.showOptionDialog(null, "Elige una opcion", "Bienvenido", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesSecundarias1, opcionesSecundarias1[0]);
        String opcionElegida[][]={{"123", "456"}};
        int contadora;
        switch (selection2){
                case 0:
                    opcionElegida=objeto.profesiones;
                    break;
                case 1:
                    opcionElegida=objeto.paisesYciudades;
                    break;
                case 2:
                    opcionElegida=objeto.verbosYadjetivos;
                    break;
                case 3:
                    opcionElegida=objeto.animales;
                    break;
                case 4:
                    opcionElegida=objeto.comida;
                    break;
                case 5:
                    opcionElegida=objeto.idiomas;
                    break;
                case 6:
                    opcionElegida=objeto.sustantivosVarios;
                    break;
                case 7:
                    contadora=objeto.profesiones.length;
                    for(int n=0; n<contadora; n++){
                    opcionElegida[n][0]=objeto.profesiones[n][0];
                    opcionElegida[0][n]=objeto.profesiones[0][n];
                    }
                    contadora+=objeto.paisesYciudades.length;
                    for(int n=profesiones.length; n<contadora; n++){
                    opcionElegida[n][0]=objeto.paisesYciudades[n][0];
                    opcionElegida[0][n]=objeto.paisesYciudades[0][n];
                    }
                    contadora+=objeto.verbosYadjetivos.length;
                    for(int n=contadora-objeto.verbosYadjetivos.length; n<contadora; n++){
                    opcionElegida[n][0]=objeto.verbosYadjetivos[n][0];
                    opcionElegida[0][n]=objeto.verbosYadjetivos[0][n];
                    }
                    contadora+=objeto.animales.length;
                    for(int n=contadora-objeto.animales.length; n<contadora; n++){
                    opcionElegida[n][0]=objeto.animales[n][0];
                    opcionElegida[0][n]=objeto.animales[0][n];
                    }
                    contadora+=objeto.comida.length;
                    for(int n=contadora-objeto.comida.length; n<contadora; n++){
                    opcionElegida[n][0]=objeto.comida[n][0];
                    opcionElegida[0][n]=objeto.comida[0][n];
                    }
                    contadora+=objeto.idiomas.length;
                    for(int n=contadora-objeto.idiomas.length; n<contadora; n++){
                    opcionElegida[n][0]=objeto.idiomas[n][0];
                    opcionElegida[0][n]=objeto.idiomas[0][n];
                    }
                    contadora+=objeto.sustantivosVarios.length;
                    for(int n=contadora-objeto.sustantivosVarios.length; n<contadora; n++){
                    opcionElegida[n][0]=objeto.sustantivosVarios[n][0];
                    opcionElegida[0][n]=objeto.sustantivosVarios[0][n];
                    }
                    
                default:
                    System.out.println("Not working");
    }
        for(int cont=0; cont<2147483646; cont++){
        int numero = (int) (Math.random() * opcionElegida.length);
        while(numero>=opcionElegida.length){
             numero--;
        }
        String respuestaIngresada="Hola";
        while(!respuestaIngresada.equals(opcionElegida[numero][1])){
        respuestaIngresada=JOptionPane.showInputDialog(opcionElegida[numero][0]);
        if(!respuestaIngresada.equals(opcionElegida[numero][1])){
            String opciones[]={"Reintentar", "Mostrar respuesta"};
            int selection_=JOptionPane.showOptionDialog(null, "Respuesta incorrecta", "Mensaje", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (selection_==1){
                JOptionPane.showMessageDialog(null, opcionElegida[numero][0]+" significa " + opcionElegida[numero][1]);
                respuestaIngresada=opcionElegida[numero][1];
            }
        }
        }
    }
    }else{
        
    }
    }
    
    
    }

