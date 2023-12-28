import { Authority } from "./authority.model";

export interface AuthObject {

    enabled: boolean;
    authorities: Authority[];
    username: string;
    accountNonExpired: boolean;
    accountNonLocked: boolean;
    credentialsNonExpired: boolean;
}