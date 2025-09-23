import { UserBase } from "./user-base";

export class Eleve extends UserBase {
    
    dob!: Date;
    typePaiement!: string;
    niveauScolaire!: NiveauScolaire;
    statutPaiement!: string;
    statutAffectation!: string;  
}
export enum NiveauScolaire {
  PREMIERE_BASE = 'PREMIERE_BASE',
  DEUXIEME_BASE = 'DEUXIEME_BASE',
  TROISIEME_BASE = 'TROISIEME_BASE',
  QUATRIEM_BASE = 'QUATRIEM_BASE',
  CINQUIEM_BASE = 'CINQUIEM_BASE',
  SIXIEME_BASE = 'SIXIEME_BASE'
}