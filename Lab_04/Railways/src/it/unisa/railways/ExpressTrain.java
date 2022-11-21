package it.unisa.railways;

import java.util.List;



    public class ExpressTrain {
        private final TrainStop stazionePartenza;
        private final TrainStop stazioneArrivo;
        private final int postiLiberi;
        private final double kmpercorsi;
        private final List<TrainStop> fermateIntermedie;
        private final int postiRistorante;


        public ExpressTrain(TrainStop stazionePartenza, TrainStop stazioneArrivo,  List<TrainStop> fermateIntermedie, int postiLiberi, int postiRisorante, double kmpercorsi) {
            this.stazionePartenza = stazionePartenza;
            this.stazioneArrivo = stazioneArrivo;
            this.fermateIntermedie = fermateIntermedie;
            this.postiLiberi = postiLiberi;
            this.kmpercorsi = kmpercorsi;
            this.postiRistorante = postiRisorante;
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

        public int getPostiRistorante() {
            return postiRistorante;
        }

        public int getTotalNumberOfStops(){
            return this.fermateIntermedie.size()+2;
        }

        public double computeMaxRevenues(double prezzoPersona, double prezzoRistorante){
            double servizioPersone = prezzoPersona * getKmpercorsi() * getPostiLiberi();
            double servizioRistorante = prezzoRistorante * getKmpercorsi() * getPostiRistorante();
            return servizioRistorante + servizioPersone;
        }

    }
