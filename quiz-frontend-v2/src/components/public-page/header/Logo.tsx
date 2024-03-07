import QuizIcon from "@mui/icons-material/Quiz";
import { Stack, Typography } from "@mui/material";

const Logo = () => {
  return (
    <Stack direction={"row"} spacing={1} p={1} flex={1}>
      <QuizIcon fontSize="large" color="primary" />
      <Typography fontSize={25} fontFamily={"sans-serif"} color="primary">
        Quizzz
      </Typography>
    </Stack>
  );
};

export default Logo;
