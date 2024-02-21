import { Navigate, RouteObject, useRoutes } from "react-router-dom";
import PublicPage from "../components/PublicPage";
import { useIsLogged } from "../features/hookIsLogged";

const publicRoutes: RouteObject[] = [
  {
    path: "/",
    element: <PublicPage />,
  },
  {
    path: "*",
    element: <Navigate to={"/"} replace />,
  },
];

const privateRoutes: RouteObject[] = [
  {
    path: "/",
    element: <PublicPage />,
  },
  {
    path: "*",
    element: <Navigate to={"/"} replace />,
  },
];

const Routing = () => {
    const isLogged = useIsLogged();
    const routes = isLogged ? privateRoutes : publicRoutes;
    return useRoutes(routes);
}

export default Routing;