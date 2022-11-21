package it.unisa.railways;

import java.util.List;

public class Train {
    private final TrainStop stazionePartenza;
    private final TrainStop stazioneArrivo;
    private final int postiLiberi;
    private final double kmpercorsi;
    private final List<TrainStop> fermateIntermedie;


    public Train(TrainStop stazionePartenza, TrainStop stazioneArrivo,  List<TrainStop> fermateIntermedie, int postiLiberi, double kmpercorsi) {
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.fermateIntermedie = fermateIntermedie;
        this.postiLiberi = postiLiberi;
        this.kmpercorsi = kmpercorsi;
    }

    public TrainStop getStazioneArrivo() {
        return stazioneArrivo;
    }

    public TrainStop getStazionePartenza() {
        return stazionePartenza;
    }

    public int getPostiLiberi() {
        return postiLiberi;
    }

    public double getKmpercorsi() {
        return kmpercorsi;
    }

    public List<TrainStop> getFermateIntermedie() {
        return fermateIntermedie;
    }

    public int getTotalNumberOfStops(){
        return this.fermateIntermedie.size()+2;
    }

    public double computeMaxRevenues(double prezzo){
        return prezzo * this.kmpercorsi * this.postiLiberi;
    }


}