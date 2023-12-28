import { RoleList } from "../../shared/constant/role-list";
import { RoleSetNameList } from "../../shared/constant/role-set-name-list";

export interface LoggedInUser {

    id: number,
    accessToken: string,
    email: string,
    accountType: RoleSetNameList,
    roles: RoleList[],
    firstName: string,
    lastName: string,
    profilePhotoFilePath: string
}