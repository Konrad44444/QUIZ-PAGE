import { AppBar, Stack } from "@mui/material";
import LoginButton from "./LoginButton";
import Logo from "./Logo";
import NavButtons from "./NavButtons";


const Header = () => {
  return (
    <AppBar>
      <Stack direction={"row"} p={2} justifyContent={"space-evenly"}>
        <Logo />
        <NavButtons />
        <LoginButton />
      </Stack>
    </AppBar>
  );
};

export default Header;
