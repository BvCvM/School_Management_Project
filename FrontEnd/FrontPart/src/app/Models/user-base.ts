export class UserBase {

    id! : number;
    firstName! : string;
    lastName! : string;
    email! : string;
    password! : string;
    adress! : string;
    phone! : string;
    roles! : Set<string>;
}
