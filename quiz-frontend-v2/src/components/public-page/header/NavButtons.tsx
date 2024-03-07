import { Button, Stack } from "@mui/material";

const NavButtons = () => {
  return (
    <Stack
      direction={"row"}
      flex={3}
          justifyContent={"space-evenly"}
          alignItems={"center"}
    >
      <Button variant={"contained"}>Main page</Button>
      <Button variant={"outlined"}>Blabla</Button>
      <Button variant={"outlined"}>Contact</Button>
    </Stack>
  );
};

export default NavButtons;
