import LoginIcon from "@mui/icons-material/Login";
import { Box, Button, Tooltip } from "@mui/material";

const LoginButton = () => {
  return (
    <Box flex={0.5}>
      <Tooltip title="Log in">
        <Button fullWidth={false}>
          <LoginIcon fontSize={"large"} />
        </Button>
      </Tooltip>
    </Box>
  );
};

export default LoginButton;
