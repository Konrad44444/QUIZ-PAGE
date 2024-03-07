import Box from "@mui/material/Box";
import { theme } from "../../../theme";
import { Button, Tooltip, Typography } from "@mui/material";
import GitHubIcon from "@mui/icons-material/GitHub";

const Footer = () => {
  return (
    <Box
      component={"footer"}
      sx={{
        position: "fixed",
        bottom: 0,
        p: 1,
        width: "100%",
        backgroundColor: theme.palette.grey[900],
      }}
      display={"flex"}
      alignItems={"center"}
      justifyContent={"space-evenly"}
    >
      <Typography color={theme.palette.grey[400]}>
        Copyrigth © Konrad Warzecha 2024
      </Typography>

      <Tooltip title="My GitHub profile :)">
        <Button href="https://github.com/Konrad44444" target="_blank">
          <GitHubIcon />
        </Button>
      </Tooltip>
    </Box>
  );
};

export default Footer;
